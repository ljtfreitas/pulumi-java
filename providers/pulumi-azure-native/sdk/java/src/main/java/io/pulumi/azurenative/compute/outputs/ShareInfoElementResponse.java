// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ShareInfoElementResponse {
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    private final String vmUri;

    @OutputCustomType.Constructor({"vmUri"})
    private ShareInfoElementResponse(String vmUri) {
        this.vmUri = Objects.requireNonNull(vmUri);
    }

    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    public String getVmUri() {
        return this.vmUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareInfoElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vmUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareInfoElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmUri = defaults.vmUri;
        }

        public Builder setVmUri(String vmUri) {
            this.vmUri = Objects.requireNonNull(vmUri);
            return this;
        }

        public ShareInfoElementResponse build() {
            return new ShareInfoElementResponse(vmUri);
        }
    }
}
