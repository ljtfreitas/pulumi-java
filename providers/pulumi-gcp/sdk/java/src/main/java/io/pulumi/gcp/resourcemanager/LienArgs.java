// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.resourcemanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LienArgs extends io.pulumi.resources.ResourceArgs {

    public static final LienArgs Empty = new LienArgs();

    /**
     * A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    @Import(name="origin", required=true)
      private final Output<String> origin;

    public Output<String> getOrigin() {
        return this.origin;
    }

    /**
     * A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. "projects/my-project-name").
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    /**
     * Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    @Import(name="reason", required=true)
      private final Output<String> reason;

    public Output<String> getReason() {
        return this.reason;
    }

    /**
     * The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. ['resourcemanager.projects.delete']
     * 
     */
    @Import(name="restrictions", required=true)
      private final Output<List<String>> restrictions;

    public Output<List<String>> getRestrictions() {
        return this.restrictions;
    }

    public LienArgs(
        Output<String> origin,
        Output<String> parent,
        Output<String> reason,
        Output<List<String>> restrictions) {
        this.origin = Objects.requireNonNull(origin, "expected parameter 'origin' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.restrictions = Objects.requireNonNull(restrictions, "expected parameter 'restrictions' to be non-null");
    }

    private LienArgs() {
        this.origin = Output.empty();
        this.parent = Output.empty();
        this.reason = Output.empty();
        this.restrictions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LienArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> origin;
        private Output<String> parent;
        private Output<String> reason;
        private Output<List<String>> restrictions;

        public Builder() {
    	      // Empty
        }

        public Builder(LienArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.origin = defaults.origin;
    	      this.parent = defaults.parent;
    	      this.reason = defaults.reason;
    	      this.restrictions = defaults.restrictions;
        }

        public Builder origin(Output<String> origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }

        public Builder origin(String origin) {
            this.origin = Output.of(Objects.requireNonNull(origin));
            return this;
        }

        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder reason(Output<String> reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder reason(String reason) {
            this.reason = Output.of(Objects.requireNonNull(reason));
            return this;
        }

        public Builder restrictions(Output<List<String>> restrictions) {
            this.restrictions = Objects.requireNonNull(restrictions);
            return this;
        }

        public Builder restrictions(List<String> restrictions) {
            this.restrictions = Output.of(Objects.requireNonNull(restrictions));
            return this;
        }
        public LienArgs build() {
            return new LienArgs(origin, parent, reason, restrictions);
        }
    }
}
