// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.enums.PubsubConfigState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PubsubConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PubsubConfigArgs Empty = new PubsubConfigArgs();

    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    @InputImport(name="state")
    private final @Nullable Input<PubsubConfigState> state;

    public Input<PubsubConfigState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="topic")
    private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public PubsubConfigArgs(
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<PubsubConfigState> state,
        @Nullable Input<String> topic) {
        this.serviceAccountEmail = serviceAccountEmail;
        this.state = state;
        this.topic = topic;
    }

    private PubsubConfigArgs() {
        this.serviceAccountEmail = Input.empty();
        this.state = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<PubsubConfigState> state;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
    	      this.topic = defaults.topic;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setState(@Nullable Input<PubsubConfigState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable PubsubConfigState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }

        public PubsubConfigArgs build() {
            return new PubsubConfigArgs(serviceAccountEmail, state, topic);
        }
    }
}