// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDiskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiskArgs Empty = new GetDiskArgs();

    @InputImport(name="diskName", required=true)
    private final String diskName;

    public String getDiskName() {
        return this.diskName;
    }

    public GetDiskArgs(String diskName) {
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
    }

    private GetDiskArgs() {
        this.diskName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskName = defaults.diskName;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public GetDiskArgs build() {
            return new GetDiskArgs(diskName);
        }
    }
}