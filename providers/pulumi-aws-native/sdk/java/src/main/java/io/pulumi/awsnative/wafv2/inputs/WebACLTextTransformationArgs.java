// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLTextTransformationType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Text Transformation on the Search String before match.
 * 
 */
public final class WebACLTextTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLTextTransformationArgs Empty = new WebACLTextTransformationArgs();

    @InputImport(name="priority", required=true)
        private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    @InputImport(name="type", required=true)
        private final Input<WebACLTextTransformationType> type;

    public Input<WebACLTextTransformationType> getType() {
        return this.type;
    }

    public WebACLTextTransformationArgs(
        Input<Integer> priority,
        Input<WebACLTextTransformationType> type) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WebACLTextTransformationArgs() {
        this.priority = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLTextTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> priority;
        private Input<WebACLTextTransformationType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLTextTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setType(Input<WebACLTextTransformationType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(WebACLTextTransformationType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public WebACLTextTransformationArgs build() {
            return new WebACLTextTransformationArgs(priority, type);
        }
    }
}
