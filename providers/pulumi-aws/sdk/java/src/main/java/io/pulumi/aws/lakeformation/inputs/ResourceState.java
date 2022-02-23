// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceState extends io.pulumi.resources.ResourceArgs {

    public static final ResourceState Empty = new ResourceState();

    /**
     * Amazon Resource Name (ARN) of the resource, an S3 path.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * (Optional) The date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @InputImport(name="lastModified")
    private final @Nullable Input<String> lastModified;

    public Input<String> getLastModified() {
        return this.lastModified == null ? Input.empty() : this.lastModified;
    }

    /**
     * Role that has read/write access to the resource. If not provided, the Lake Formation service-linked role must exist and is used.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    public ResourceState(
        @Nullable Input<String> arn,
        @Nullable Input<String> lastModified,
        @Nullable Input<String> roleArn) {
        this.arn = arn;
        this.lastModified = lastModified;
        this.roleArn = roleArn;
    }

    private ResourceState() {
        this.arn = Input.empty();
        this.lastModified = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> lastModified;
        private @Nullable Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.lastModified = defaults.lastModified;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setLastModified(@Nullable Input<String> lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder setLastModified(@Nullable String lastModified) {
            this.lastModified = Input.ofNullable(lastModified);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }
        public ResourceState build() {
            return new ResourceState(arn, lastModified, roleArn);
        }
    }
}
