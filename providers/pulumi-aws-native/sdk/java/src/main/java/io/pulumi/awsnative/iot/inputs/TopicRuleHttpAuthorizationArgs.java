// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleSigV4AuthorizationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleHttpAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleHttpAuthorizationArgs Empty = new TopicRuleHttpAuthorizationArgs();

    @InputImport(name="sigv4")
    private final @Nullable Input<TopicRuleSigV4AuthorizationArgs> sigv4;

    public Input<TopicRuleSigV4AuthorizationArgs> getSigv4() {
        return this.sigv4 == null ? Input.empty() : this.sigv4;
    }

    public TopicRuleHttpAuthorizationArgs(@Nullable Input<TopicRuleSigV4AuthorizationArgs> sigv4) {
        this.sigv4 = sigv4;
    }

    private TopicRuleHttpAuthorizationArgs() {
        this.sigv4 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleHttpAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TopicRuleSigV4AuthorizationArgs> sigv4;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleHttpAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sigv4 = defaults.sigv4;
        }

        public Builder setSigv4(@Nullable Input<TopicRuleSigV4AuthorizationArgs> sigv4) {
            this.sigv4 = sigv4;
            return this;
        }

        public Builder setSigv4(@Nullable TopicRuleSigV4AuthorizationArgs sigv4) {
            this.sigv4 = Input.ofNullable(sigv4);
            return this;
        }

        public TopicRuleHttpAuthorizationArgs build() {
            return new TopicRuleHttpAuthorizationArgs(sigv4);
        }
    }
}