// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleSigV4Authorization;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleHttpAuthorization extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleHttpAuthorization Empty = new TopicRuleHttpAuthorization();

    @Import(name="sigv4")
      private final @Nullable TopicRuleSigV4Authorization sigv4;

    public Optional<TopicRuleSigV4Authorization> getSigv4() {
        return this.sigv4 == null ? Optional.empty() : Optional.ofNullable(this.sigv4);
    }

    public TopicRuleHttpAuthorization(@Nullable TopicRuleSigV4Authorization sigv4) {
        this.sigv4 = sigv4;
    }

    private TopicRuleHttpAuthorization() {
        this.sigv4 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleHttpAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TopicRuleSigV4Authorization sigv4;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleHttpAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sigv4 = defaults.sigv4;
        }

        public Builder sigv4(@Nullable TopicRuleSigV4Authorization sigv4) {
            this.sigv4 = sigv4;
            return this;
        }
        public TopicRuleHttpAuthorization build() {
            return new TopicRuleHttpAuthorization(sigv4);
        }
    }
}
