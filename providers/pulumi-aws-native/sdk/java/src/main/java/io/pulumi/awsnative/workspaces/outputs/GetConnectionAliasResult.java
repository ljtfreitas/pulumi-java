// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.workspaces.outputs;

import io.pulumi.awsnative.workspaces.enums.ConnectionAliasState;
import io.pulumi.awsnative.workspaces.outputs.ConnectionAliasAssociation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectionAliasResult {
    private final @Nullable String aliasId;
    private final @Nullable List<ConnectionAliasAssociation> associations;
    private final @Nullable ConnectionAliasState connectionAliasState;

    @OutputCustomType.Constructor({"aliasId","associations","connectionAliasState"})
    private GetConnectionAliasResult(
        @Nullable String aliasId,
        @Nullable List<ConnectionAliasAssociation> associations,
        @Nullable ConnectionAliasState connectionAliasState) {
        this.aliasId = aliasId;
        this.associations = associations;
        this.connectionAliasState = connectionAliasState;
    }

    public Optional<String> getAliasId() {
        return Optional.ofNullable(this.aliasId);
    }
    public List<ConnectionAliasAssociation> getAssociations() {
        return this.associations == null ? List.of() : this.associations;
    }
    public Optional<ConnectionAliasState> getConnectionAliasState() {
        return Optional.ofNullable(this.connectionAliasState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aliasId;
        private @Nullable List<ConnectionAliasAssociation> associations;
        private @Nullable ConnectionAliasState connectionAliasState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasId = defaults.aliasId;
    	      this.associations = defaults.associations;
    	      this.connectionAliasState = defaults.connectionAliasState;
        }

        public Builder setAliasId(@Nullable String aliasId) {
            this.aliasId = aliasId;
            return this;
        }

        public Builder setAssociations(@Nullable List<ConnectionAliasAssociation> associations) {
            this.associations = associations;
            return this;
        }

        public Builder setConnectionAliasState(@Nullable ConnectionAliasState connectionAliasState) {
            this.connectionAliasState = connectionAliasState;
            return this;
        }
        public GetConnectionAliasResult build() {
            return new GetConnectionAliasResult(aliasId, associations, connectionAliasState);
        }
    }
}
