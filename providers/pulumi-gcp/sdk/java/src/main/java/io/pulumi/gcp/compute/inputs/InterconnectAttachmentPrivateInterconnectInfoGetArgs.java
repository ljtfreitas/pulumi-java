// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InterconnectAttachmentPrivateInterconnectInfoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InterconnectAttachmentPrivateInterconnectInfoGetArgs Empty = new InterconnectAttachmentPrivateInterconnectInfoGetArgs();

    @Import(name="tag8021q")
      private final @Nullable Output<Integer> tag8021q;

    public Output<Integer> tag8021q() {
        return this.tag8021q == null ? Codegen.empty() : this.tag8021q;
    }

    public InterconnectAttachmentPrivateInterconnectInfoGetArgs(@Nullable Output<Integer> tag8021q) {
        this.tag8021q = tag8021q;
    }

    private InterconnectAttachmentPrivateInterconnectInfoGetArgs() {
        this.tag8021q = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPrivateInterconnectInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> tag8021q;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentPrivateInterconnectInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag8021q = defaults.tag8021q;
        }

        public Builder tag8021q(@Nullable Output<Integer> tag8021q) {
            this.tag8021q = tag8021q;
            return this;
        }
        public Builder tag8021q(@Nullable Integer tag8021q) {
            this.tag8021q = Codegen.ofNullable(tag8021q);
            return this;
        }        public InterconnectAttachmentPrivateInterconnectInfoGetArgs build() {
            return new InterconnectAttachmentPrivateInterconnectInfoGetArgs(tag8021q);
        }
    }
}
