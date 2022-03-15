// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceGetArgs;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigGetArgs Empty = new ManagedZoneServiceDirectoryConfigGetArgs();

    /**
     * The namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<ManagedZoneServiceDirectoryConfigNamespaceGetArgs> namespace;

    public Output<ManagedZoneServiceDirectoryConfigNamespaceGetArgs> getNamespace() {
        return this.namespace;
    }

    public ManagedZoneServiceDirectoryConfigGetArgs(Output<ManagedZoneServiceDirectoryConfigNamespaceGetArgs> namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigGetArgs() {
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagedZoneServiceDirectoryConfigNamespaceGetArgs> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(Output<ManagedZoneServiceDirectoryConfigNamespaceGetArgs> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder namespace(ManagedZoneServiceDirectoryConfigNamespaceGetArgs namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public ManagedZoneServiceDirectoryConfigGetArgs build() {
            return new ManagedZoneServiceDirectoryConfigGetArgs(namespace);
        }
    }
}
