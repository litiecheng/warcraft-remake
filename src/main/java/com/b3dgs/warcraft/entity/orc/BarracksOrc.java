/*
 * Copyright (C) 2013-2014 Byron 3D Games Studio (www.b3dgs.com) Pierre-Alexandre (contact@b3dgs.com)
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package com.b3dgs.warcraft.entity.orc;

import com.b3dgs.warcraft.RaceOrc;
import com.b3dgs.warcraft.entity.BuildingProducer;
import com.b3dgs.warcraft.entity.SetupEntity;
import com.b3dgs.warcraft.skill.orc.ProduceGrunt;
import com.b3dgs.warcraft.skill.orc.ProduceSpearman;

/**
 * Barracks building implementation. This building allows to create new grunt and spearman.
 * 
 * @author Pierre-Alexandre (contact@b3dgs.com)
 */
public final class BarracksOrc
        extends BuildingProducer
        implements RaceOrc
{
    /**
     * Constructor.
     * 
     * @param setup The setup reference.
     */
    public BarracksOrc(SetupEntity setup)
    {
        super(setup);
        addSkill(0, ProduceGrunt.class, 0);
        addSkill(0, ProduceSpearman.class, 1);
    }
}