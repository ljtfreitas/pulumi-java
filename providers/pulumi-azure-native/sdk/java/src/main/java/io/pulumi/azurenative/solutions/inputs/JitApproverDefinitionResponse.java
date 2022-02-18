// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * JIT approver definition.
 * 
 */
public final class JitApproverDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final JitApproverDefinitionResponse Empty = new JitApproverDefinitionResponse();

    /**
     * The approver display name.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The approver service principal Id.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The approver type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public JitApproverDefinitionResponse(
        @Nullable String displayName,
        String id,
        @Nullable String type) {
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.type = type;
    }

    private JitApproverDefinitionResponse() {
        this.displayName = null;
        this.id = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitApproverDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JitApproverDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public JitApproverDefinitionResponse build() {
            return new JitApproverDefinitionResponse(displayName, id, type);
        }
    }
}
