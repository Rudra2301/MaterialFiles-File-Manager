/*
 * Copyright (c) 2018 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.files.settings;

public class StandardDirectorySettingsEntry
        extends SettingsEntries.TypedListSettingsEntry<StandardDirectorySettings> {

    public StandardDirectorySettingsEntry(int keyResId) {
        super(keyResId, StandardDirectorySettings.CREATOR);
    }
}
