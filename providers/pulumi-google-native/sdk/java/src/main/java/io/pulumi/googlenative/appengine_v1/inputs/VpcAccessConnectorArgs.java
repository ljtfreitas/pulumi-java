// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.enums.VpcAccessConnectorEgressSetting;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VPC access connector specification.
 * 
 */
public final class VpcAccessConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcAccessConnectorArgs Empty = new VpcAccessConnectorArgs();

    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
     */
    @InputImport(name="egressSetting")
      private final @Nullable Input<VpcAccessConnectorEgressSetting> egressSetting;

    public Input<VpcAccessConnectorEgressSetting> getEgressSetting() {
        return this.egressSetting == null ? Input.empty() : this.egressSetting;
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public VpcAccessConnectorArgs(
        @Nullable Input<VpcAccessConnectorEgressSetting> egressSetting,
        @Nullable Input<String> name) {
        this.egressSetting = egressSetting;
        this.name = name;
    }

    private VpcAccessConnectorArgs() {
        this.egressSetting = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VpcAccessConnectorEgressSetting> egressSetting;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressSetting = defaults.egressSetting;
    	      this.name = defaults.name;
        }

        public Builder setEgressSetting(@Nullable Input<VpcAccessConnectorEgressSetting> egressSetting) {
            this.egressSetting = egressSetting;
            return this;
        }

        public Builder setEgressSetting(@Nullable VpcAccessConnectorEgressSetting egressSetting) {
            this.egressSetting = Input.ofNullable(egressSetting);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public VpcAccessConnectorArgs build() {
            return new VpcAccessConnectorArgs(egressSetting, name);
        }
    }
}
