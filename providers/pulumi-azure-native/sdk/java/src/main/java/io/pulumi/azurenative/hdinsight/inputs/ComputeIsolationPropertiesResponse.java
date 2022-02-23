// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The compute isolation properties.
 * 
 */
public final class ComputeIsolationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeIsolationPropertiesResponse Empty = new ComputeIsolationPropertiesResponse();

    /**
     * The flag indicates whether enable compute isolation or not.
     * 
     */
    @InputImport(name="enableComputeIsolation")
        private final @Nullable Boolean enableComputeIsolation;

    public Optional<Boolean> getEnableComputeIsolation() {
        return this.enableComputeIsolation == null ? Optional.empty() : Optional.ofNullable(this.enableComputeIsolation);
    }

    /**
     * The host sku.
     * 
     */
    @InputImport(name="hostSku")
        private final @Nullable String hostSku;

    public Optional<String> getHostSku() {
        return this.hostSku == null ? Optional.empty() : Optional.ofNullable(this.hostSku);
    }

    public ComputeIsolationPropertiesResponse(
        @Nullable Boolean enableComputeIsolation,
        @Nullable String hostSku) {
        this.enableComputeIsolation = enableComputeIsolation == null ? false : enableComputeIsolation;
        this.hostSku = hostSku;
    }

    private ComputeIsolationPropertiesResponse() {
        this.enableComputeIsolation = null;
        this.hostSku = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeIsolationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableComputeIsolation;
        private @Nullable String hostSku;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeIsolationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComputeIsolation = defaults.enableComputeIsolation;
    	      this.hostSku = defaults.hostSku;
        }

        public Builder setEnableComputeIsolation(@Nullable Boolean enableComputeIsolation) {
            this.enableComputeIsolation = enableComputeIsolation;
            return this;
        }

        public Builder setHostSku(@Nullable String hostSku) {
            this.hostSku = hostSku;
            return this;
        }
        public ComputeIsolationPropertiesResponse build() {
            return new ComputeIsolationPropertiesResponse(enableComputeIsolation, hostSku);
        }
    }
}
