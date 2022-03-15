// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpcAccessConnectorResponse {
    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
     */
    private final String egressSetting;
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private VpcAccessConnectorResponse(
        @CustomType.Parameter("egressSetting") String egressSetting,
        @CustomType.Parameter("name") String name) {
        this.egressSetting = egressSetting;
        this.name = name;
    }

    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
    */
    public String getEgressSetting() {
        return this.egressSetting;
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
    */
    public String getName() {
        return this.name;
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
