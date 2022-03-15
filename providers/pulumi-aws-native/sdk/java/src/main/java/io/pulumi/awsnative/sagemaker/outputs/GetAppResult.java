// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.AppResourceSpec;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppResult {
    /**
     * The Amazon Resource Name (ARN) of the app.
     * 
     */
    private final @Nullable String appArn;
    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
     */
    private final @Nullable AppResourceSpec resourceSpec;

    @CustomType.Constructor
    private GetAppResult(
        @CustomType.Parameter("appArn") @Nullable String appArn,
        @CustomType.Parameter("resourceSpec") @Nullable AppResourceSpec resourceSpec) {
        this.appArn = appArn;
        this.resourceSpec = resourceSpec;
    }

    /**
     * The Amazon Resource Name (ARN) of the app.
     * 
    */
    public Optional<String> getAppArn() {
        return Optional.ofNullable(this.appArn);
    }
    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
    */
    public Optional<AppResourceSpec> getResourceSpec() {
        return Optional.ofNullable(this.resourceSpec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appArn;
        private @Nullable AppResourceSpec resourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appArn = defaults.appArn;
    	      this.resourceSpec = defaults.resourceSpec;
        }

        public Builder appArn(@Nullable String appArn) {
            this.appArn = appArn;
            return this;
        }

        public Builder resourceSpec(@Nullable AppResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public GetAppResult build() {
            return new GetAppResult(appArn, resourceSpec);
        }
    }
}
