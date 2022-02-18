// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IngestionSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngestionSettingArgs Empty = new IngestionSettingArgs();

    /**
     * Name of the ingestion setting
     * 
     */
    @InputImport(name="ingestionSettingName")
    private final @Nullable Input<String> ingestionSettingName;

    public Input<String> getIngestionSettingName() {
        return this.ingestionSettingName == null ? Input.empty() : this.ingestionSettingName;
    }

    public IngestionSettingArgs(@Nullable Input<String> ingestionSettingName) {
        this.ingestionSettingName = ingestionSettingName;
    }

    private IngestionSettingArgs() {
        this.ingestionSettingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngestionSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ingestionSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(IngestionSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestionSettingName = defaults.ingestionSettingName;
        }

        public Builder setIngestionSettingName(@Nullable Input<String> ingestionSettingName) {
            this.ingestionSettingName = ingestionSettingName;
            return this;
        }

        public Builder setIngestionSettingName(@Nullable String ingestionSettingName) {
            this.ingestionSettingName = Input.ofNullable(ingestionSettingName);
            return this;
        }

        public IngestionSettingArgs build() {
            return new IngestionSettingArgs(ingestionSettingName);
        }
    }
}
