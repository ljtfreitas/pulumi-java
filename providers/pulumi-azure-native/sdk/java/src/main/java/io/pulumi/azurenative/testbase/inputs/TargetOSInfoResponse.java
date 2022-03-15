// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The information of the target OS to be tested.
 * 
 */
public final class TargetOSInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetOSInfoResponse Empty = new TargetOSInfoResponse();

    /**
     * Specifies the OS update type to test against, e.g., 'Security updates' or 'Feature updates'.
     * 
     */
    @Import(name="osUpdateType", required=true)
      private final String osUpdateType;

    public String getOsUpdateType() {
        return this.osUpdateType;
    }

    /**
     * Specifies the target OSs to be tested.
     * 
     */
    @Import(name="targetOSs", required=true)
      private final List<String> targetOSs;

    public List<String> getTargetOSs() {
        return this.targetOSs;
    }

    public TargetOSInfoResponse(
        String osUpdateType,
        List<String> targetOSs) {
        this.osUpdateType = Objects.requireNonNull(osUpdateType, "expected parameter 'osUpdateType' to be non-null");
        this.targetOSs = Objects.requireNonNull(targetOSs, "expected parameter 'targetOSs' to be non-null");
    }

    private TargetOSInfoResponse() {
        this.osUpdateType = null;
        this.targetOSs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetOSInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osUpdateType;
        private List<String> targetOSs;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetOSInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osUpdateType = defaults.osUpdateType;
    	      this.targetOSs = defaults.targetOSs;
        }

        public Builder osUpdateType(String osUpdateType) {
            this.osUpdateType = Objects.requireNonNull(osUpdateType);
            return this;
        }

        public Builder targetOSs(List<String> targetOSs) {
            this.targetOSs = Objects.requireNonNull(targetOSs);
            return this;
        }
        public TargetOSInfoResponse build() {
            return new TargetOSInfoResponse(osUpdateType, targetOSs);
        }
    }
}
