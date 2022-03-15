// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.Architecture;
import io.pulumi.azurenative.containerregistry.enums.OS;
import io.pulumi.azurenative.containerregistry.enums.Variant;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The platform properties against which the run has to happen.
 * 
 */
public final class PlatformPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlatformPropertiesArgs Empty = new PlatformPropertiesArgs();

    /**
     * The OS architecture.
     * 
     */
    @Import(name="architecture")
      private final @Nullable Output<Either<String,Architecture>> architecture;

    public Output<Either<String,Architecture>> getArchitecture() {
        return this.architecture == null ? Output.empty() : this.architecture;
    }

    /**
     * The operating system type required for the run.
     * 
     */
    @Import(name="os", required=true)
      private final Output<Either<String,OS>> os;

    public Output<Either<String,OS>> getOs() {
        return this.os;
    }

    /**
     * Variant of the CPU.
     * 
     */
    @Import(name="variant")
      private final @Nullable Output<Either<String,Variant>> variant;

    public Output<Either<String,Variant>> getVariant() {
        return this.variant == null ? Output.empty() : this.variant;
    }

    public PlatformPropertiesArgs(
        @Nullable Output<Either<String,Architecture>> architecture,
        Output<Either<String,OS>> os,
        @Nullable Output<Either<String,Variant>> variant) {
        this.architecture = architecture;
        this.os = Objects.requireNonNull(os, "expected parameter 'os' to be non-null");
        this.variant = variant;
    }

    private PlatformPropertiesArgs() {
        this.architecture = Output.empty();
        this.os = Output.empty();
        this.variant = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlatformPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Architecture>> architecture;
        private Output<Either<String,OS>> os;
        private @Nullable Output<Either<String,Variant>> variant;

        public Builder() {
    	      // Empty
        }

        public Builder(PlatformPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.os = defaults.os;
    	      this.variant = defaults.variant;
        }

        public Builder architecture(@Nullable Output<Either<String,Architecture>> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder architecture(@Nullable Either<String,Architecture> architecture) {
            this.architecture = Output.ofNullable(architecture);
            return this;
        }

        public Builder os(Output<Either<String,OS>> os) {
            this.os = Objects.requireNonNull(os);
            return this;
        }

        public Builder os(Either<String,OS> os) {
            this.os = Output.of(Objects.requireNonNull(os));
            return this;
        }

        public Builder variant(@Nullable Output<Either<String,Variant>> variant) {
            this.variant = variant;
            return this;
        }

        public Builder variant(@Nullable Either<String,Variant> variant) {
            this.variant = Output.ofNullable(variant);
            return this;
        }
        public PlatformPropertiesArgs build() {
            return new PlatformPropertiesArgs(architecture, os, variant);
        }
    }
}
