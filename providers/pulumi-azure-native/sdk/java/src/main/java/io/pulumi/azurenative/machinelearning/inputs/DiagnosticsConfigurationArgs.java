// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.DiagnosticsLevel;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="expiry")
      private final @Nullable Output<String> expiry;

    public Output<String> getExpiry() {
        return this.expiry == null ? Output.empty() : this.expiry;
    }

    /**
     * Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
     * 
     */
    @Import(name="level", required=true)
      private final Output<Either<String,DiagnosticsLevel>> level;

    public Output<Either<String,DiagnosticsLevel>> getLevel() {
        return this.level;
    }

    public DiagnosticsConfigurationArgs(
        @Nullable Output<String> expiry,
        Output<Either<String,DiagnosticsLevel>> level) {
        this.expiry = expiry;
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
    }

    private DiagnosticsConfigurationArgs() {
        this.expiry = Output.empty();
        this.level = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expiry;
        private Output<Either<String,DiagnosticsLevel>> level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.level = defaults.level;
        }

        public Builder expiry(@Nullable Output<String> expiry) {
            this.expiry = expiry;
            return this;
        }

        public Builder expiry(@Nullable String expiry) {
            this.expiry = Output.ofNullable(expiry);
            return this;
        }

        public Builder level(Output<Either<String,DiagnosticsLevel>> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder level(Either<String,DiagnosticsLevel> level) {
            this.level = Output.of(Objects.requireNonNull(level));
            return this;
        }
        public DiagnosticsConfigurationArgs build() {
            return new DiagnosticsConfigurationArgs(expiry, level);
        }
    }
}
