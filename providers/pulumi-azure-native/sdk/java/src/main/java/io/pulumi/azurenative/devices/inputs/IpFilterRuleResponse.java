// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The IP filter rules for the IoT hub.
 * 
 */
public final class IpFilterRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpFilterRuleResponse Empty = new IpFilterRuleResponse();

    /**
     * The desired action for requests captured by this rule.
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * The name of the IP filter rule.
     * 
     */
    @Import(name="filterName", required=true)
      private final String filterName;

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @Import(name="ipMask", required=true)
      private final String ipMask;

    public String getIpMask() {
        return this.ipMask;
    }

    public IpFilterRuleResponse(
        String action,
        String filterName,
        String ipMask) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
        this.ipMask = Objects.requireNonNull(ipMask, "expected parameter 'ipMask' to be non-null");
    }

    private IpFilterRuleResponse() {
        this.action = null;
        this.filterName = null;
        this.ipMask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String filterName;
        private String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(IpFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder filterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }

        public Builder ipMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public IpFilterRuleResponse build() {
            return new IpFilterRuleResponse(action, filterName, ipMask);
        }
    }
}
