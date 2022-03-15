// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VPC access connector specification.
 * 
 */
public final class VpcAccessConnectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpcAccessConnectorResponse Empty = new VpcAccessConnectorResponse();

    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
     */
    @Import(name="egressSetting", required=true)
      private final String egressSetting;

    public String getEgressSetting() {
        return this.egressSetting;
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public VpcAccessConnectorResponse(
        String egressSetting,
        String name) {
        this.egressSetting = Objects.requireNonNull(egressSetting, "expected parameter 'egressSetting' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private VpcAccessConnectorResponse() {
        this.egressSetting = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessConnectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String egressSetting;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessConnectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressSetting = defaults.egressSetting;
    	      this.name = defaults.name;
        }

        public Builder egressSetting(String egressSetting) {
            this.egressSetting = Objects.requireNonNull(egressSetting);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public VpcAccessConnectorResponse build() {
            return new VpcAccessConnectorResponse(egressSetting, name);
        }
    }
}
