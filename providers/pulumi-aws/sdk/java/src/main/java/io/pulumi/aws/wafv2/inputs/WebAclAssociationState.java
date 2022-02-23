// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final WebAclAssociationState Empty = new WebAclAssociationState();

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
     * 
     */
    @InputImport(name="resourceArn")
    private final @Nullable Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn == null ? Input.empty() : this.resourceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    @InputImport(name="webAclArn")
    private final @Nullable Input<String> webAclArn;

    public Input<String> getWebAclArn() {
        return this.webAclArn == null ? Input.empty() : this.webAclArn;
    }

    public WebAclAssociationState(
        @Nullable Input<String> resourceArn,
        @Nullable Input<String> webAclArn) {
        this.resourceArn = resourceArn;
        this.webAclArn = webAclArn;
    }

    private WebAclAssociationState() {
        this.resourceArn = Input.empty();
        this.webAclArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceArn;
        private @Nullable Input<String> webAclArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webAclArn = defaults.webAclArn;
        }

        public Builder setResourceArn(@Nullable Input<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = Input.ofNullable(resourceArn);
            return this;
        }

        public Builder setWebAclArn(@Nullable Input<String> webAclArn) {
            this.webAclArn = webAclArn;
            return this;
        }

        public Builder setWebAclArn(@Nullable String webAclArn) {
            this.webAclArn = Input.ofNullable(webAclArn);
            return this;
        }
        public WebAclAssociationState build() {
            return new WebAclAssociationState(resourceArn, webAclArn);
        }
    }
}