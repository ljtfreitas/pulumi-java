// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="subscriptionId", required=true)
      private final String subscriptionId;

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public GetSubscriptionArgs(
        @Nullable String project,
        String subscriptionId) {
        this.project = project;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private GetSubscriptionArgs() {
        this.project = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public GetSubscriptionArgs build() {
            return new GetSubscriptionArgs(project, subscriptionId);
        }
    }
}
