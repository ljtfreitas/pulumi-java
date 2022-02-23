// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetImageImageTestsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetImageImageTestsConfiguration Empty = new GetImageImageTestsConfiguration();

    /**
     * Whether image tests are enabled.
     * 
     */
    @InputImport(name="imageTestsEnabled", required=true)
    private final Boolean imageTestsEnabled;

    public Boolean getImageTestsEnabled() {
        return this.imageTestsEnabled;
    }

    /**
     * Number of minutes before image tests time out.
     * 
     */
    @InputImport(name="timeoutMinutes", required=true)
    private final Integer timeoutMinutes;

    public Integer getTimeoutMinutes() {
        return this.timeoutMinutes;
    }

    public GetImageImageTestsConfiguration(
        Boolean imageTestsEnabled,
        Integer timeoutMinutes) {
        this.imageTestsEnabled = Objects.requireNonNull(imageTestsEnabled, "expected parameter 'imageTestsEnabled' to be non-null");
        this.timeoutMinutes = Objects.requireNonNull(timeoutMinutes, "expected parameter 'timeoutMinutes' to be non-null");
    }

    private GetImageImageTestsConfiguration() {
        this.imageTestsEnabled = null;
        this.timeoutMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageImageTestsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean imageTestsEnabled;
        private Integer timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageImageTestsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder setImageTestsEnabled(Boolean imageTestsEnabled) {
            this.imageTestsEnabled = Objects.requireNonNull(imageTestsEnabled);
            return this;
        }

        public Builder setTimeoutMinutes(Integer timeoutMinutes) {
            this.timeoutMinutes = Objects.requireNonNull(timeoutMinutes);
            return this;
        }
        public GetImageImageTestsConfiguration build() {
            return new GetImageImageTestsConfiguration(imageTestsEnabled, timeoutMinutes);
        }
    }
}
