// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLienArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLienArgs Empty = new GetLienArgs();

    @InputImport(name="lienId", required=true)
      private final String lienId;

    public String getLienId() {
        return this.lienId;
    }

    public GetLienArgs(String lienId) {
        this.lienId = Objects.requireNonNull(lienId, "expected parameter 'lienId' to be non-null");
    }

    private GetLienArgs() {
        this.lienId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLienArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lienId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLienArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lienId = defaults.lienId;
        }

        public Builder setLienId(String lienId) {
            this.lienId = Objects.requireNonNull(lienId);
            return this;
        }
        public GetLienArgs build() {
            return new GetLienArgs(lienId);
        }
    }
}
