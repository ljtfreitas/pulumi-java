// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.LoggingDestinationResponse;
import java.util.List;
import java.util.Objects;


/**
 * Logging configuration of the service. The following example shows how to configure logs to be sent to the producer and consumer projects. In the example, the `activity_history` log is sent to both the producer and consumer projects, whereas the `purchase_history` log is only sent to the producer project. monitored_resources: - type: library.googleapis.com/branch labels: - key: /city description: The city where the library branch is located in. - key: /name description: The name of the branch. logs: - name: activity_history labels: - key: /customer_id - name: purchase_history logging: producer_destinations: - monitored_resource: library.googleapis.com/branch logs: - activity_history - purchase_history consumer_destinations: - monitored_resource: library.googleapis.com/branch logs: - activity_history
 * 
 */
public final class LoggingResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingResponse Empty = new LoggingResponse();

    /**
     * Logging configurations for sending logs to the consumer project. There can be multiple consumer destinations, each one must have a different monitored resource type. A log can be used in at most one consumer destination.
     * 
     */
    @InputImport(name="consumerDestinations", required=true)
      private final List<LoggingDestinationResponse> consumerDestinations;

    public List<LoggingDestinationResponse> getConsumerDestinations() {
        return this.consumerDestinations;
    }

    /**
     * Logging configurations for sending logs to the producer project. There can be multiple producer destinations, each one must have a different monitored resource type. A log can be used in at most one producer destination.
     * 
     */
    @InputImport(name="producerDestinations", required=true)
      private final List<LoggingDestinationResponse> producerDestinations;

    public List<LoggingDestinationResponse> getProducerDestinations() {
        return this.producerDestinations;
    }

    public LoggingResponse(
        List<LoggingDestinationResponse> consumerDestinations,
        List<LoggingDestinationResponse> producerDestinations) {
        this.consumerDestinations = Objects.requireNonNull(consumerDestinations, "expected parameter 'consumerDestinations' to be non-null");
        this.producerDestinations = Objects.requireNonNull(producerDestinations, "expected parameter 'producerDestinations' to be non-null");
    }

    private LoggingResponse() {
        this.consumerDestinations = List.of();
        this.producerDestinations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LoggingDestinationResponse> consumerDestinations;
        private List<LoggingDestinationResponse> producerDestinations;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
    	      this.producerDestinations = defaults.producerDestinations;
        }

        public Builder setConsumerDestinations(List<LoggingDestinationResponse> consumerDestinations) {
            this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
            return this;
        }

        public Builder setProducerDestinations(List<LoggingDestinationResponse> producerDestinations) {
            this.producerDestinations = Objects.requireNonNull(producerDestinations);
            return this;
        }
        public LoggingResponse build() {
            return new LoggingResponse(consumerDestinations, producerDestinations);
        }
    }
}
