// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    @InputImport(name="desiredState", required=true)
    private final Input<String> desiredState;

    public Input<String> getDesiredState() {
        return this.desiredState;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * JSON string of the CloudFormation resource type schema which is used for plan time validation where possible. Automatically fetched if not provided. In large scale environments with multiple resources using the same `type_name`, it is recommended to fetch the schema once via the `aws.cloudformation.CloudFormationType` data source and use this argument to reduce `DescribeType` API operation throttling. This value is marked sensitive only to prevent large plan differences from showing.
     * 
     */
    @InputImport(name="schema")
    private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @InputImport(name="typeName", required=true)
    private final Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName;
    }

    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @InputImport(name="typeVersionId")
    private final @Nullable Input<String> typeVersionId;

    public Input<String> getTypeVersionId() {
        return this.typeVersionId == null ? Input.empty() : this.typeVersionId;
    }

    public ResourceArgs(
        Input<String> desiredState,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> schema,
        Input<String> typeName,
        @Nullable Input<String> typeVersionId) {
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.roleArn = roleArn;
        this.schema = schema;
        this.typeName = Objects.requireNonNull(typeName, "expected parameter 'typeName' to be non-null");
        this.typeVersionId = typeVersionId;
    }

    private ResourceArgs() {
        this.desiredState = Input.empty();
        this.roleArn = Input.empty();
        this.schema = Input.empty();
        this.typeName = Input.empty();
        this.typeVersionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> desiredState;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> schema;
        private Input<String> typeName;
        private @Nullable Input<String> typeVersionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.roleArn = defaults.roleArn;
    	      this.schema = defaults.schema;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionId = defaults.typeVersionId;
        }

        public Builder setDesiredState(Input<String> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Input.of(Objects.requireNonNull(desiredState));
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

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setTypeName(Input<String> typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }

        public Builder setTypeName(String typeName) {
            this.typeName = Input.of(Objects.requireNonNull(typeName));
            return this;
        }

        public Builder setTypeVersionId(@Nullable Input<String> typeVersionId) {
            this.typeVersionId = typeVersionId;
            return this;
        }

        public Builder setTypeVersionId(@Nullable String typeVersionId) {
            this.typeVersionId = Input.ofNullable(typeVersionId);
            return this;
        }
        public ResourceArgs build() {
            return new ResourceArgs(desiredState, roleArn, schema, typeName, typeVersionId);
        }
    }
}
