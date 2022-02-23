// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResponsePlanNotificationTargetItem {
    private final @Nullable String snsTopicArn;

    @OutputCustomType.Constructor({"snsTopicArn"})
    private ResponsePlanNotificationTargetItem(@Nullable String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    public Optional<String> getSnsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanNotificationTargetItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanNotificationTargetItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }
        public ResponsePlanNotificationTargetItem build() {
            return new ResponsePlanNotificationTargetItem(snsTopicArn);
        }
    }
}
