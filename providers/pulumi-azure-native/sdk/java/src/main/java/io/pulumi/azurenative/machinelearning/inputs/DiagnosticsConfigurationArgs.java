// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.DiagnosticsLevel;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Diagnostics settings for an Azure ML web service.
 * 
 */
public final class DiagnosticsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticsConfigurationArgs Empty = new DiagnosticsConfigurationArgs();

    /**
     * Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
     * 
     */
    @InputImport(name="expiry")
        private final @Nullable Input<String> expiry;

    public Input<String> getExpiry() {
        return this.expiry == null ? Input.empty() : this.expiry;
    }

    /**
     * Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
     * 
     */
    @InputImport(name="level", required=true)
        private final Input<Either<String,DiagnosticsLevel>> level;

    public Input<Either<String,DiagnosticsLevel>> getLevel() {
        return this.level;
    }

    public DiagnosticsConfigurationArgs(
        @Nullable Input<String> expiry,
        Input<Either<String,DiagnosticsLevel>> level) {
        this.expiry = expiry;
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
    }

    private DiagnosticsConfigurationArgs() {
        this.expiry = Input.empty();
        this.level = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expiry;
        private Input<Either<String,DiagnosticsLevel>> level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.level = defaults.level;
        }

        public Builder setExpiry(@Nullable Input<String> expiry) {
            this.expiry = expiry;
            return this;
        }

        public Builder setExpiry(@Nullable String expiry) {
            this.expiry = Input.ofNullable(expiry);
            return this;
        }

        public Builder setLevel(Input<Either<String,DiagnosticsLevel>> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setLevel(Either<String,DiagnosticsLevel> level) {
            this.level = Input.of(Objects.requireNonNull(level));
            return this;
        }
        public DiagnosticsConfigurationArgs build() {
            return new DiagnosticsConfigurationArgs(expiry, level);
        }
    }
}
