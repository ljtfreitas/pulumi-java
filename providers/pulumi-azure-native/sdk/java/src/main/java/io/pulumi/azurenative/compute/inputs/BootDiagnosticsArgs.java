// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
 * 
 */
public final class BootDiagnosticsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BootDiagnosticsArgs Empty = new BootDiagnosticsArgs();

    /**
     * Whether boot diagnostics should be enabled on the Virtual Machine.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Uri of the storage account to use for placing the console output and screenshot. <br><br>If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     * 
     */
    @Import(name="storageUri")
      private final @Nullable Output<String> storageUri;

    public Output<String> getStorageUri() {
        return this.storageUri == null ? Output.empty() : this.storageUri;
    }

    public BootDiagnosticsArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> storageUri) {
        this.enabled = enabled;
        this.storageUri = storageUri;
    }

    private BootDiagnosticsArgs() {
        this.enabled = Output.empty();
        this.storageUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder storageUri(@Nullable Output<String> storageUri) {
            this.storageUri = storageUri;
            return this;
        }

        public Builder storageUri(@Nullable String storageUri) {
            this.storageUri = Output.ofNullable(storageUri);
            return this;
        }
        public BootDiagnosticsArgs build() {
            return new BootDiagnosticsArgs(enabled, storageUri);
        }
    }
}
