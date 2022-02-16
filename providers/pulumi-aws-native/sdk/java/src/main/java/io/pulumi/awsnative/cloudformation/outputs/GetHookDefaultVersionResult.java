// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHookDefaultVersionResult {
    private final @Nullable String arn;
    private final @Nullable String typeName;
    private final @Nullable String typeVersionArn;
    private final @Nullable String versionId;

    @OutputCustomType.Constructor({"arn","typeName","typeVersionArn","versionId"})
    private GetHookDefaultVersionResult(
        @Nullable String arn,
        @Nullable String typeName,
        @Nullable String typeVersionArn,
        @Nullable String versionId) {
        this.arn = arn;
        this.typeName = typeName;
        this.typeVersionArn = typeVersionArn;
        this.versionId = versionId;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getTypeName() {
        return Optional.ofNullable(this.typeName);
    }
    public Optional<String> getTypeVersionArn() {
        return Optional.ofNullable(this.typeVersionArn);
    }
    public Optional<String> getVersionId() {
        return Optional.ofNullable(this.versionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHookDefaultVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String typeName;
        private @Nullable String typeVersionArn;
        private @Nullable String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHookDefaultVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionArn = defaults.typeVersionArn;
    	      this.versionId = defaults.versionId;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setTypeVersionArn(@Nullable String typeVersionArn) {
            this.typeVersionArn = typeVersionArn;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }

        public GetHookDefaultVersionResult build() {
            return new GetHookDefaultVersionResult(arn, typeName, typeVersionArn, versionId);
        }
    }
}