// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.UsageRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration controlling usage of a service.
 * 
 */
public final class UsageResponse extends io.pulumi.resources.InvokeArgs {

    public static final UsageResponse Empty = new UsageResponse();

    /**
     * The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
     * 
     */
    @InputImport(name="producerNotificationChannel", required=true)
      private final String producerNotificationChannel;

    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel;
    }

    /**
     * Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include "serviceusage.googleapis.com/tos/cloud". Other Google APIs should include "serviceusage.googleapis.com/tos/universal". Additional ToS can be included based on the business needs.
     * 
     */
    @InputImport(name="requirements", required=true)
      private final List<String> requirements;

    public List<String> getRequirements() {
        return this.requirements;
    }

    /**
     * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @InputImport(name="rules", required=true)
      private final List<UsageRuleResponse> rules;

    public List<UsageRuleResponse> getRules() {
        return this.rules;
    }

    public UsageResponse(
        String producerNotificationChannel,
        List<String> requirements,
        List<UsageRuleResponse> rules) {
        this.producerNotificationChannel = Objects.requireNonNull(producerNotificationChannel, "expected parameter 'producerNotificationChannel' to be non-null");
        this.requirements = Objects.requireNonNull(requirements, "expected parameter 'requirements' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private UsageResponse() {
        this.producerNotificationChannel = null;
        this.requirements = List.of();
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String producerNotificationChannel;
        private List<String> requirements;
        private List<UsageRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.producerNotificationChannel = defaults.producerNotificationChannel;
    	      this.requirements = defaults.requirements;
    	      this.rules = defaults.rules;
        }

        public Builder setProducerNotificationChannel(String producerNotificationChannel) {
            this.producerNotificationChannel = Objects.requireNonNull(producerNotificationChannel);
            return this;
        }

        public Builder setRequirements(List<String> requirements) {
            this.requirements = Objects.requireNonNull(requirements);
            return this;
        }

        public Builder setRules(List<UsageRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public UsageResponse build() {
            return new UsageResponse(producerNotificationChannel, requirements, rules);
        }
    }
}
