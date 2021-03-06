/*
 * HeadsUp Agile
 * Copyright 2009-2012 Heads Up Development Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.headsupdev.agile.core;

import org.headsupdev.agile.api.AbstractTask;
import org.headsupdev.agile.api.HeadsUpConfiguration;
import org.headsupdev.agile.api.Manager;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

/**
 * Event stored when system looks for updates
 *
 * @author Andrew Williams
 * @version $Id$
 * @since 1.0
 */
@Entity
@DiscriminatorValue( "updatecheck" )
public class UpdateCheckTask
    extends AbstractTask
{
    public UpdateCheckTask() {
        super( "Checking for updates", "Checking for updated versions of the " +
            Manager.getStorageInstance().getGlobalConfiguration().getProductName() + " software" );
    }
}
