// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FhirStoreNotificationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreNotificationConfigGetArgs Empty = new FhirStoreNotificationConfigGetArgs();

    /**
     * The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    @Import(name="pubsubTopic", required=true)
      private final Output<String> pubsubTopic;

    public Output<String> pubsubTopic() {
        return this.pubsubTopic;
    }

    public FhirStoreNotificationConfigGetArgs(Output<String> pubsubTopic) {
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
    }

    private FhirStoreNotificationConfigGetArgs() {
        this.pubsubTopic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreNotificationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder pubsubTopic(Output<String> pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Output.of(Objects.requireNonNull(pubsubTopic));
            return this;
        }        public FhirStoreNotificationConfigGetArgs build() {
            return new FhirStoreNotificationConfigGetArgs(pubsubTopic);
        }
    }
}
