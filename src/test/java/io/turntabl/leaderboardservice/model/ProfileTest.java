package io.turntabl.leaderboardservice.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProfileTest {

    @Mock
    private Profile profile;

    @Test
    void setLanguageLevels() {
        LanguageLevel l1 = mock(LanguageLevel.class);
        LanguageLevel l2 = mock(LanguageLevel.class);

        List<LanguageLevel> levels = List.of(l1, l2);

        when(profile.setLanguageLevels(levels)).thenReturn(profile);

        assertThat(profile.setLanguageLevels(levels)).isEqualTo(profile);
    }
}