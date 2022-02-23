// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTagKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagKeyArgs Empty = new GetTagKeyArgs();

    @InputImport(name="tagKeyId", required=true)
      private final String tagKeyId;

    public String getTagKeyId() {
        return this.tagKeyId;
    }

    public GetTagKeyArgs(String tagKeyId) {
        this.tagKeyId = Objects.requireNonNull(tagKeyId, "expected parameter 'tagKeyId' to be non-null");
    }

    private GetTagKeyArgs() {
        this.tagKeyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKeyId = defaults.tagKeyId;
        }

        public Builder setTagKeyId(String tagKeyId) {
            this.tagKeyId = Objects.requireNonNull(tagKeyId);
            return this;
        }
        public GetTagKeyArgs build() {
            return new GetTagKeyArgs(tagKeyId);
        }
    }
}
