// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AppBlockTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppBlockTagArgs Empty = new AppBlockTagArgs();

    @Import(name="tagKey", required=true)
      private final Output<String> tagKey;

    public Output<String> getTagKey() {
        return this.tagKey;
    }

    @Import(name="tagValue", required=true)
      private final Output<String> tagValue;

    public Output<String> getTagValue() {
        return this.tagValue;
    }

    public AppBlockTagArgs(
        Output<String> tagKey,
        Output<String> tagValue) {
        this.tagKey = Objects.requireNonNull(tagKey, "expected parameter 'tagKey' to be non-null");
        this.tagValue = Objects.requireNonNull(tagValue, "expected parameter 'tagValue' to be non-null");
    }

    private AppBlockTagArgs() {
        this.tagKey = Output.empty();
        this.tagValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppBlockTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> tagKey;
        private Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AppBlockTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder tagKey(Output<String> tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }

        public Builder tagKey(String tagKey) {
            this.tagKey = Output.of(Objects.requireNonNull(tagKey));
            return this;
        }

        public Builder tagValue(Output<String> tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }

        public Builder tagValue(String tagValue) {
            this.tagValue = Output.of(Objects.requireNonNull(tagValue));
            return this;
        }
        public AppBlockTagArgs build() {
            return new AppBlockTagArgs(tagKey, tagValue);
        }
    }
}
