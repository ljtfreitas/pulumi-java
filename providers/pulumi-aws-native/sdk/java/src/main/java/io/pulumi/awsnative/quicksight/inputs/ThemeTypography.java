// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.ThemeFont;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The typeface for the theme.</p>
 * 
 */
public final class ThemeTypography extends io.pulumi.resources.InvokeArgs {

    public static final ThemeTypography Empty = new ThemeTypography();

    @InputImport(name="fontFamilies")
        private final @Nullable List<ThemeFont> fontFamilies;

    public List<ThemeFont> getFontFamilies() {
        return this.fontFamilies == null ? List.of() : this.fontFamilies;
    }

    public ThemeTypography(@Nullable List<ThemeFont> fontFamilies) {
        this.fontFamilies = fontFamilies;
    }

    private ThemeTypography() {
        this.fontFamilies = List.of();
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

        public Builder setFontFamilies(@Nullable List<ThemeFont> fontFamilies) {
            this.fontFamilies = fontFamilies;
            return this;
        }
        public ThemeTypography build() {
            return new ThemeTypography(fontFamilies);
        }
    }
}
