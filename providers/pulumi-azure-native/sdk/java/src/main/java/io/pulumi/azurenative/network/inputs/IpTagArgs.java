// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the IpTag associated with the object.
 * 
 */
public final class IpTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpTagArgs Empty = new IpTagArgs();

    /**
     * The IP tag type. Example: FirstPartyUsage.
     * 
     */
    @InputImport(name="ipTagType")
    private final @Nullable Input<String> ipTagType;

    public Input<String> getIpTagType() {
        return this.ipTagType == null ? Input.empty() : this.ipTagType;
    }

    /**
     * The value of the IP tag associated with the public IP. Example: SQL.
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    public IpTagArgs(
        @Nullable Input<String> ipTagType,
        @Nullable Input<String> tag) {
        this.ipTagType = ipTagType;
        this.tag = tag;
    }

    private IpTagArgs() {
        this.ipTagType = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipTagType;
        private @Nullable Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(IpTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipTagType = defaults.ipTagType;
    	      this.tag = defaults.tag;
        }

        public Builder setIpTagType(@Nullable Input<String> ipTagType) {
            this.ipTagType = ipTagType;
            return this;
        }

        public Builder setIpTagType(@Nullable String ipTagType) {
            this.ipTagType = Input.ofNullable(ipTagType);
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public IpTagArgs build() {
            return new IpTagArgs(ipTagType, tag);
        }
    }
}
