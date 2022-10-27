package at.crowdware.ubucon;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import at.crowdware.ubucon.databinding.ActivityMainBinding;

import io.storj.Project;
import io.storj.BucketInfo;
import io.storj.StorjException;
import io.storj.Uplink;
import io.storj.Access;

public class MainActivity extends AppCompatActivity
{

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String grant = "1jAfVgQBb5bJ13JH7E6UoYxSWnEayX8QnJA6mtdZ4xXW5pijg8ZxPjv8wQv6eCRQo88vSVD1hBjg4AoFcGnpixJB1zL9ygQDV4mRDFqAs6NJZDAqtBFbuJwkYKHixEy1zD1Uae6j997LLHGsL76dL7eYBCJLTzKgcnUk291VTPLWAH4z2YKrxS6YXQoQmsfk6UCHmVZQ9UZkS9iLgtCafZs7iNB2v84qd2M8Q4QoGzqVN5Ks94zhxBf7yQ1RhFxm9Gqg2QS9eSN75RNg9FcTjhwvdDmYP49QbpoYeeC3eA";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        Uplink uplink = new Uplink();
        try
        {
            Properties props = new Properties();
            Access access;
            try
            {
                props.load(new FileReader(new File(context.getFilesDir(), "auth")));
                access = Access.parse(props.getProperty("grant"));
            }
            catch (IOException e)
            {
                throw new StorjException(e);
            }
            Project project = uplink.openProject(access);
            BucketInfo info = project.statBucket("ubucon");

            /*
            props.setProperty("grant", grant);
            try
            {
                props.store(new PrintWriter(new File(context.getFilesDir(), "auth")), null);
            }
            catch (IOException e)
            {
                throw new StorjException(e);
            }
            */
        }
        catch(StorjException se)
        {
            Toast toast = Toast.makeText(context, se.toString(), duration);
            toast.show();
        }

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow).setOpenableLayout(drawer).build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}