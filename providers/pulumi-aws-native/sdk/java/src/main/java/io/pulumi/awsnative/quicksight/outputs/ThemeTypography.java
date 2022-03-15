// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.ThemeFont;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ThemeTypography {
    private final @Nullable List<ThemeFont> fontFamilies;

    @CustomType.Constructor
    private ThemeTypography(@CustomType.Parameter("fontFamilies") @Nullable List<ThemeFont> fontFamilies) {
        this.fontFamilies = fontFamilies;
    }

    public List<ThemeFont> getFontFamilies() {
        return this.fontFamilies == null ? List.of() : this.fontFamilies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTypography defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ThemeFont> fontFamilies;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTypography defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontFamilies = defaults.fontFamilies;
        }

        public Builder fontFamilies(@Nullable List<ThemeFont> fontFamilies) {
            this.fontFamilies = fontFamilies;
            return this;
        }
        public ThemeTypography build() {
            return new ThemeTypography(fontFamilies);
        }
    }
}
