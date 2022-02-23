// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorApacheKafkaCluster;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ConnectorKafkaCluster {
    private final ConnectorApacheKafkaCluster apacheKafkaCluster;

    @OutputCustomType.Constructor({"apacheKafkaCluster"})
    private ConnectorKafkaCluster(ConnectorApacheKafkaCluster apacheKafkaCluster) {
        this.apacheKafkaCluster = Objects.requireNonNull(apacheKafkaCluster);
    }

    public ConnectorApacheKafkaCluster getApacheKafkaCluster() {
        return this.apacheKafkaCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorApacheKafkaCluster apacheKafkaCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apacheKafkaCluster = defaults.apacheKafkaCluster;
        }

        public Builder setApacheKafkaCluster(ConnectorApacheKafkaCluster apacheKafkaCluster) {
            this.apacheKafkaCluster = Objects.requireNonNull(apacheKafkaCluster);
            return this;
        }
        public ConnectorKafkaCluster build() {
            return new ConnectorKafkaCluster(apacheKafkaCluster);
        }
    }
}
