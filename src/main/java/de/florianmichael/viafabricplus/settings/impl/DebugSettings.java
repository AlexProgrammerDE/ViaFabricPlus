/*
 * This file is part of ViaFabricPlus - https://github.com/FlorianMichael/ViaFabricPlus
 * Copyright (C) 2021-2024 FlorianMichael/EnZaXD
 * Copyright (C) 2024      RK_01/RaphiMC and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.viafabricplus.settings.impl;

import de.florianmichael.viafabricplus.settings.base.BooleanSetting;
import de.florianmichael.viafabricplus.settings.base.SettingGroup;
import de.florianmichael.viafabricplus.settings.base.VersionedBooleanSetting;
import net.minecraft.text.Text;
import net.raphimc.vialoader.util.VersionEnum;
import net.raphimc.vialoader.util.VersionRange;

public class DebugSettings extends SettingGroup {
    private static final DebugSettings instance = new DebugSettings();

    public final BooleanSetting queueConfigPackets = new BooleanSetting(this, Text.translatable("debug_settings.viafabricplus.queue_config_packets"), true);

    // 1.19 -> 1.18.2
    public final VersionedBooleanSetting disableSequencing = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.disable_sequencing"), VersionRange.andOlder(VersionEnum.r1_18_2));

    // 1.17 -> 1.16.5
    public final VersionedBooleanSetting alwaysTickClientPlayer = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.always_tick_client_player"), VersionRange.andOlder(VersionEnum.r1_8).add(VersionRange.andNewer(VersionEnum.r1_17)));

    // 1.13 -> 1.12.2
    public final VersionedBooleanSetting executeInputsInSync = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.execute_inputs_in_sync"), VersionRange.andOlder(VersionEnum.r1_12_2));
    public final VersionedBooleanSetting sneakInstant = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.sneak_instant"), VersionRange.of(VersionEnum.r1_8, VersionEnum.r1_12_2));

    // 1.12 -> 1.11.1-1.11.2
    public final VersionedBooleanSetting sendOpenInventoryPacket = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.send_open_inventory_packet"), VersionRange.andOlder(VersionEnum.r1_11_1to1_11_2));

    // 1.9 -> 1.8.x
    public final VersionedBooleanSetting removeCooldowns = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.remove_cooldowns"), VersionRange.andOlder(VersionEnum.r1_8));
    public final VersionedBooleanSetting sendIdlePacket = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.send_idle_packet"), VersionRange.of(VersionEnum.r1_4_2, VersionEnum.r1_8).add(VersionRange.andOlder(VersionEnum.r1_2_4tor1_2_5)));
    public final VersionedBooleanSetting replaceAttributeModifiers = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.replace_attribute_modifiers"), VersionRange.andOlder(VersionEnum.r1_8));
    public final VersionedBooleanSetting preventEntityCramming = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.prevent_entity_cramming"), VersionRange.andOlder(VersionEnum.r1_8));

    // 1.8.x -> 1.7.6
    public final VersionedBooleanSetting replaceSneaking = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.replace_sneaking"), VersionRange.andOlder(VersionEnum.r1_8));
    public final VersionedBooleanSetting longSneaking = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.long_sneaking"), VersionRange.andOlder(VersionEnum.r1_7_6tor1_7_10));

    // 1.5/1.5.1 -> 1.4.6/1.4.7
    public final VersionedBooleanSetting legacyMiningSpeeds = new VersionedBooleanSetting(this, Text.translatable("debug_settings.viafabricplus.legacy_mining_speeds"), VersionRange.andOlder(VersionEnum.r1_4_6tor1_4_7));

    public DebugSettings() {
        super(Text.translatable("setting_group_name.viafabricplus.debug"));
    }

    public static DebugSettings global() {
        return instance;
    }

}
