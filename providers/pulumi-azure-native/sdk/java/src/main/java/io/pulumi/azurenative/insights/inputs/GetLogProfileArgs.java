// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLogProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLogProfileArgs Empty = new GetLogProfileArgs();

    /**
     * The name of the log profile.
     * 
     */
    @InputImport(name="logProfileName", required=true)
    private final String logProfileName;

    public String getLogProfileName() {
        return this.logProfileName;
    }

    public GetLogProfileArgs(String logProfileName) {
        this.logProfileName = Objects.requireNonNull(logProfileName, "expected parameter 'logProfileName' to be non-null");
    }

    private GetLogProfileArgs() {
        this.logProfileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logProfileName = defaults.logProfileName;
        }

        public Builder setLogProfileName(String logProfileName) {
            this.logProfileName = Objects.requireNonNull(logProfileName);
            return this;
        }

        public GetLogProfileArgs build() {
            return new GetLogProfileArgs(logProfileName);
        }
    }
}
