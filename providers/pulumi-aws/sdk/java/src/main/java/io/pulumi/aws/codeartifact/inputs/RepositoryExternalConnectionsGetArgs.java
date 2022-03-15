// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryExternalConnectionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryExternalConnectionsGetArgs Empty = new RepositoryExternalConnectionsGetArgs();

    /**
     * The name of the external connection associated with a repository.
     * 
     */
    @Import(name="externalConnectionName", required=true)
      private final Output<String> externalConnectionName;

    public Output<String> getExternalConnectionName() {
        return this.externalConnectionName;
    }

    @Import(name="packageFormat")
      private final @Nullable Output<String> packageFormat;

    public Output<String> getPackageFormat() {
        return this.packageFormat == null ? Output.empty() : this.packageFormat;
    }

    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public RepositoryExternalConnectionsGetArgs(
        Output<String> externalConnectionName,
        @Nullable Output<String> packageFormat,
        @Nullable Output<String> status) {
        this.externalConnectionName = Objects.requireNonNull(externalConnectionName, "expected parameter 'externalConnectionName' to be non-null");
        this.packageFormat = packageFormat;
        this.status = status;
    }

    private RepositoryExternalConnectionsGetArgs() {
        this.externalConnectionName = Output.empty();
        this.packageFormat = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryExternalConnectionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> externalConnectionName;
        private @Nullable Output<String> packageFormat;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryExternalConnectionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalConnectionName = defaults.externalConnectionName;
    	      this.packageFormat = defaults.packageFormat;
    	      this.status = defaults.status;
        }

        public Builder externalConnectionName(Output<String> externalConnectionName) {
            this.externalConnectionName = Objects.requireNonNull(externalConnectionName);
            return this;
        }

        public Builder externalConnectionName(String externalConnectionName) {
            this.externalConnectionName = Output.of(Objects.requireNonNull(externalConnectionName));
            return this;
        }

        public Builder packageFormat(@Nullable Output<String> packageFormat) {
            this.packageFormat = packageFormat;
            return this;
        }

        public Builder packageFormat(@Nullable String packageFormat) {
            this.packageFormat = Output.ofNullable(packageFormat);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public RepositoryExternalConnectionsGetArgs build() {
            return new RepositoryExternalConnectionsGetArgs(externalConnectionName, packageFormat, status);
        }
    }
}
