// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.ThemeDataColorPalette;
import io.pulumi.awsnative.quicksight.outputs.ThemeSheetStyle;
import io.pulumi.awsnative.quicksight.outputs.ThemeTypography;
import io.pulumi.awsnative.quicksight.outputs.ThemeUIColorPalette;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThemeConfiguration {
    private final @Nullable ThemeDataColorPalette dataColorPalette;
    private final @Nullable ThemeSheetStyle sheet;
    private final @Nullable ThemeTypography typography;
    private final @Nullable ThemeUIColorPalette uIColorPalette;

    @OutputCustomType.Constructor
    private ThemeConfiguration(
        @OutputCustomType.Parameter("dataColorPalette") @Nullable ThemeDataColorPalette dataColorPalette,
        @OutputCustomType.Parameter("sheet") @Nullable ThemeSheetStyle sheet,
        @OutputCustomType.Parameter("typography") @Nullable ThemeTypography typography,
        @OutputCustomType.Parameter("uIColorPalette") @Nullable ThemeUIColorPalette uIColorPalette) {
        this.dataColorPalette = dataColorPalette;
        this.sheet = sheet;
        this.typography = typography;
        this.uIColorPalette = uIColorPalette;
    }

    public Optional<ThemeDataColorPalette> getDataColorPalette() {
        return Optional.ofNullable(this.dataColorPalette);
    }
    public Optional<ThemeSheetStyle> getSheet() {
        return Optional.ofNullable(this.sheet);
    }
    public Optional<ThemeTypography> getTypography() {
        return Optional.ofNullable(this.typography);
    }
    public Optional<ThemeUIColorPalette> getUIColorPalette() {
        return Optional.ofNullable(this.uIColorPalette);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ThemeDataColorPalette dataColorPalette;
        private @Nullable ThemeSheetStyle sheet;
        private @Nullable ThemeTypography typography;
        private @Nullable ThemeUIColorPalette uIColorPalette;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataColorPalette = defaults.dataColorPalette;
    	      this.sheet = defaults.sheet;
    	      this.typography = defaults.typography;
    	      this.uIColorPalette = defaults.uIColorPalette;
        }

        public Builder setDataColorPalette(@Nullable ThemeDataColorPalette dataColorPalette) {
            this.dataColorPalette = dataColorPalette;
            return this;
        }

        public Builder setSheet(@Nullable ThemeSheetStyle sheet) {
            this.sheet = sheet;
            return this;
        }

        public Builder setTypography(@Nullable ThemeTypography typography) {
            this.typography = typography;
            return this;
        }

        public Builder setUIColorPalette(@Nullable ThemeUIColorPalette uIColorPalette) {
            this.uIColorPalette = uIColorPalette;
            return this;
        }
        public ThemeConfiguration build() {
            return new ThemeConfiguration(dataColorPalette, sheet, typography, uIColorPalette);
        }
    }
}
