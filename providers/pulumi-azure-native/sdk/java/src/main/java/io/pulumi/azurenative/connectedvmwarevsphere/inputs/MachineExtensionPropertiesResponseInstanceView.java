// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.MachineExtensionInstanceViewResponseStatus;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The machine extension instance view.
 * 
 */
public final class MachineExtensionPropertiesResponseInstanceView extends io.pulumi.resources.InvokeArgs {

    public static final MachineExtensionPropertiesResponseInstanceView Empty = new MachineExtensionPropertiesResponseInstanceView();

    /**
     * The machine extension name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Instance view status.
     * 
     */
    @InputImport(name="status")
        private final @Nullable MachineExtensionInstanceViewResponseStatus status;

    public Optional<MachineExtensionInstanceViewResponseStatus> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @InputImport(name="typeHandlerVersion", required=true)
        private final String typeHandlerVersion;

    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public MachineExtensionPropertiesResponseInstanceView(
        String name,
        @Nullable MachineExtensionInstanceViewResponseStatus status,
        String type,
        String typeHandlerVersion) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = status;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion, "expected parameter 'typeHandlerVersion' to be non-null");
    }

    private MachineExtensionPropertiesResponseInstanceView() {
        this.name = null;
        this.status = null;
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionPropertiesResponseInstanceView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable MachineExtensionInstanceViewResponseStatus status;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionPropertiesResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(@Nullable MachineExtensionInstanceViewResponseStatus status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }
        public MachineExtensionPropertiesResponseInstanceView build() {
            return new MachineExtensionPropertiesResponseInstanceView(name, status, type, typeHandlerVersion);
        }
    }
}
