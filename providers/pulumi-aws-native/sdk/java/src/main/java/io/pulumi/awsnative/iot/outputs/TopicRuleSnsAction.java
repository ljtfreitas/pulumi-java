// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleSnsAction {
    private final @Nullable String messageFormat;
    private final String roleArn;
    private final String targetArn;

    @CustomType.Constructor
    private TopicRuleSnsAction(
        @CustomType.Parameter("messageFormat") @Nullable String messageFormat,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("targetArn") String targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = roleArn;
        this.targetArn = targetArn;
    }

    public Optional<String> getMessageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public String getTargetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSnsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String messageFormat;
        private String roleArn;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSnsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public TopicRuleSnsAction build() {
            return new TopicRuleSnsAction(messageFormat, roleArn, targetArn);
        }
    }
}
