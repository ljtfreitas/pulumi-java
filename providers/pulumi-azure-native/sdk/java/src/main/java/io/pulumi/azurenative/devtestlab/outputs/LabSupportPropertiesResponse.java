// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabSupportPropertiesResponse {
    /**
     * Is the lab support banner active/enabled at this time?
     * 
     */
    private final @Nullable String enabled;
    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    private final @Nullable String markdown;

    @CustomType.Constructor
    private LabSupportPropertiesResponse(
        @CustomType.Parameter("enabled") @Nullable String enabled,
        @CustomType.Parameter("markdown") @Nullable String markdown) {
        this.enabled = enabled;
        this.markdown = markdown;
    }

    /**
     * Is the lab support banner active/enabled at this time?
     * 
    */
    public Optional<String> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
    */
    public Optional<String> getMarkdown() {
        return Optional.ofNullable(this.markdown);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabSupportPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String markdown;

        public Builder() {
    	      // Empty
        }

        public Builder(LabSupportPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.markdown = defaults.markdown;
        }

        public Builder enabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder markdown(@Nullable String markdown) {
            this.markdown = markdown;
            return this;
        }
        public LabSupportPropertiesResponse build() {
            return new LabSupportPropertiesResponse(enabled, markdown);
        }
    }
}
