/****************************************************************************
* Copyright (C) 2021 CrowdWare
*
* This file is part of UBUCON.
*
*  UBUCON is free software: you can redistribute it and/or modify
*  it under the terms of the GNU General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  (at your option) any later version.
*
*  UBUCON is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU General Public License for more details.
*
*  You should have received a copy of the GNU General Public License
*  along with UBUCON.  If not, see <http://www.gnu.org/licenses/>.
*
****************************************************************************/

import QtQuick 2.12
import QtQuick.Layouts 1.12
import QtQuick.Controls 2.12
import QtQuick.Controls.Material 2.12
import at.crowdware.backend 1.0

Page 
{
	id: page
	title: "HOME"

	Text
	{
		id: text
		anchors.top: parent.top
    	anchors.right: parent.right
    	anchors.left: parent.left
    	anchors.margins: page.width / 10
		width: parent.width
		font.pointSize: 20
		wrapMode: Text.WordWrap;
		text: backend.menuModel.count() > 1 ? "Willkommen bei UBUCON" : "Willkommen bei UBUCON<br><br>Zu allererst solltest Du dir ein Plugin installieren, um UBUCON nutzen zu können."
	}
}