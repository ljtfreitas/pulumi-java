// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTriggerListCallbackUrlQueriesResponse {
    /**
     * The api version.
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * The SAS timestamp.
     * 
     */
    private final @Nullable String se;
    /**
     * The SAS signature.
     * 
     */
    private final @Nullable String sig;
    /**
     * The SAS permissions.
     * 
     */
    private final @Nullable String sp;
    /**
     * The SAS version.
     * 
     */
    private final @Nullable String sv;

    @OutputCustomType.Constructor({"apiVersion","se","sig","sp","sv"})
    private WorkflowTriggerListCallbackUrlQueriesResponse(
        @Nullable String apiVersion,
        @Nullable String se,
        @Nullable String sig,
        @Nullable String sp,
        @Nullable String sv) {
        this.apiVersion = apiVersion;
        this.se = se;
        this.sig = sig;
        this.sp = sp;
        this.sv = sv;
    }

    /**
     * The api version.
     * 
     */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * The SAS timestamp.
     * 
     */
    public Optional<String> getSe() {
        return Optional.ofNullable(this.se);
    }
    /**
     * The SAS signature.
     * 
     */
    public Optional<String> getSig() {
        return Optional.ofNullable(this.sig);
    }
    /**
     * The SAS permissions.
     * 
     */
    public Optional<String> getSp() {
        return Optional.ofNullable(this.sp);
    }
    /**
     * The SAS version.
     * 
     */
    public Optional<String> getSv() {
        return Optional.ofNullable(this.sv);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTriggerListCallbackUrlQueriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String se;
        private @Nullable String sig;
        private @Nullable String sp;
        private @Nullable String sv;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTriggerListCallbackUrlQueriesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.se = defaults.se;
    	      this.sig = defaults.sig;
    	      this.sp = defaults.sp;
    	      this.sv = defaults.sv;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setSe(@Nullable String se) {
            this.se = se;
            return this;
        }

        public Builder setSig(@Nullable String sig) {
            this.sig = sig;
            return this;
        }

        public Builder setSp(@Nullable String sp) {
            this.sp = sp;
            return this;
        }

        public Builder setSv(@Nullable String sv) {
            this.sv = sv;
            return this;
        }

        public WorkflowTriggerListCallbackUrlQueriesResponse build() {
            return new WorkflowTriggerListCallbackUrlQueriesResponse(apiVersion, se, sig, sp, sv);
        }
    }
}
