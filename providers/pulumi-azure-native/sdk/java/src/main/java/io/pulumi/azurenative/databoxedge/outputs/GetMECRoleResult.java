// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMECRoleResult {
    /**
     * Activation key of the MEC.
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse connectionString;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Role type.
     * Expected value is 'MEC'.
     * 
     */
    private final String kind;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Role status.
     * 
     */
    private final String roleStatus;
    /**
     * Role configured on ASE resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"connectionString","id","kind","name","roleStatus","systemData","type"})
    private GetMECRoleResult(
        @Nullable AsymmetricEncryptedSecretResponse connectionString,
        String id,
        String kind,
        String name,
        String roleStatus,
        SystemDataResponse systemData,
        String type) {
        this.connectionString = connectionString;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.roleStatus = Objects.requireNonNull(roleStatus);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Activation key of the MEC.
     * 
     */
    public Optional<AsymmetricEncryptedSecretResponse> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Role type.
     * Expected value is 'MEC'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Role status.
     * 
     */
    public String getRoleStatus() {
        return this.roleStatus;
    }
    /**
     * Role configured on ASE resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMECRoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse connectionString;
        private String id;
        private String kind;
        private String name;
        private String roleStatus;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMECRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.roleStatus = defaults.roleStatus;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setConnectionString(@Nullable AsymmetricEncryptedSecretResponse connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRoleStatus(String roleStatus) {
            this.roleStatus = Objects.requireNonNull(roleStatus);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetMECRoleResult build() {
            return new GetMECRoleResult(connectionString, id, kind, name, roleStatus, systemData, type);
        }
    }
}
