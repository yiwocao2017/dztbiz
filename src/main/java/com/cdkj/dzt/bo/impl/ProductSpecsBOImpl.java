package com.cdkj.dzt.bo.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.dzt.bo.IProductSpecsBO;
import com.cdkj.dzt.bo.base.PaginableBOImpl;
import com.cdkj.dzt.dao.IProductSpecsDAO;
import com.cdkj.dzt.domain.ModelSpecs;
import com.cdkj.dzt.domain.Order;
import com.cdkj.dzt.domain.Product;
import com.cdkj.dzt.domain.ProductSpecs;
import com.cdkj.dzt.enums.EMeasureKey;

@Component
public class ProductSpecsBOImpl extends PaginableBOImpl<ProductSpecs> implements
        IProductSpecsBO {

    @Autowired
    private IProductSpecsDAO productSpecsDAO;

    @Override
    public void removeProductSpecs(String productCode) {
        ProductSpecs data = new ProductSpecs();
        data.setProductCode(productCode);
        productSpecsDAO.delete(data);
    }

    @Override
    public void inputInforValue(Order order, Product product,
            Map<String, String> map) {
        String productCode = product.getCode();
        String orderCode = order.getCode();

        this.saveLWCL(orderCode, productCode,
            map.get(EMeasureKey.LWCL.getCode()));
        this.saveSWCL(orderCode, productCode,
            map.get(EMeasureKey.SWCL.getCode()));
        this.saveYWCL(orderCode, productCode,
            map.get(EMeasureKey.YWCL.getCode()));
        this.saveTWCL(orderCode, productCode,
            map.get(EMeasureKey.TWCL.getCode()));
        this.saveJKCL(orderCode, productCode,
            map.get(EMeasureKey.JKCL.getCode()));
        this.saveYCCL(orderCode, productCode,
            map.get(EMeasureKey.YCCL.getCode()));
        this.saveXCCL(orderCode, productCode,
            map.get(EMeasureKey.XCCL.getCode()));
        this.saveBWCL(orderCode, productCode,
            map.get(EMeasureKey.BWCL.getCode()));
        this.saveWWCL(orderCode, productCode,
            map.get(EMeasureKey.WWCL.getCode()));

        this.saveLWCY(orderCode, productCode,
            map.get(EMeasureKey.LWCY.getCode()));
        this.saveSWCY(orderCode, productCode,
            map.get(EMeasureKey.SWCY.getCode()));
        this.saveYWCY(orderCode, productCode,
            map.get(EMeasureKey.YWCY.getCode()));
        this.saveTWCY(orderCode, productCode,
            map.get(EMeasureKey.TWCY.getCode()));
        this.saveJKCY(orderCode, productCode,
            map.get(EMeasureKey.JKCY.getCode()));
        this.saveYCCY(orderCode, productCode,
            map.get(EMeasureKey.YCCY.getCode()));
        this.saveXCCY(orderCode, productCode,
            map.get(EMeasureKey.XCCY.getCode()));
        this.saveBWCY(orderCode, productCode,
            map.get(EMeasureKey.BWCY.getCode()));
        this.saveWWCY(orderCode, productCode,
            map.get(EMeasureKey.WWCY.getCode()));

        this.saveQXK(orderCode, productCode, map.get(EMeasureKey.QXK.getCode()));
        this.saveHBK(orderCode, productCode, map.get(EMeasureKey.HBK.getCode()));
        this.saveZTW(orderCode, productCode, map.get(EMeasureKey.ZTW.getCode()));

        this.saveGXCX(orderCode, productCode,
            map.get(EMeasureKey.GXCX.getCode()));

        this.saveNL(orderCode, productCode, map.get(EMeasureKey.NL.getCode()));
        this.saveSG(orderCode, productCode, map.get(EMeasureKey.SG.getCode()));
        this.saveTZ(orderCode, productCode, map.get(EMeasureKey.TZ.getCode()));
        this.saveYJDZ(orderCode, productCode,
            map.get(EMeasureKey.YJDZ.getCode()));
        this.saveBEIZHU(orderCode, productCode,
            map.get(EMeasureKey.BEIZHU.getCode()));
    }

    private void saveBEIZHU(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.BEIZHU.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveQXK(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.QXK.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveHBK(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.HBK.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveZTW(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.ZTW.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveYJDZ(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.YJDZ.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveTZ(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.TZ.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveSG(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.SG.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveNL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.NL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveWWCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.WWCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveBWCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.BWCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveXCCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.XCCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveYCCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.YCCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveJKCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.JKCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveTWCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.TWCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveYWCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.YWCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveSWCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.SWCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveLWCY(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.LWCY.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveWWCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.WWCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveBWCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.BWCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveXCCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.XCCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveYCCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.YCCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveJKCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.JKCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveTWCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.TWCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveYWCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.YWCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveSWCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.SWCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveLWCL(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.LWCL.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    private void saveGXCX(String orderCode, String productCode, String value) {
        if (StringUtils.isNotBlank(value)) {
            ProductSpecs data = new ProductSpecs();
            data.setCode(value);
            data.setParentCode(EMeasureKey.GXCX.getCode());
            data.setProductCode(productCode);
            data.setOrderCode(orderCode);
            productSpecsDAO.insert(data);
        }
    }

    @Override
    public void inputInforCode(Order order, Product product,
            Map<String, String> valueMap, Map<String, ModelSpecs> modelSmap) {

        String productCode = product.getCode();
        String orderCode = order.getCode();

        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.CSGG.getCode()))) {
            this.saveCSGG(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.CSGG.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.CSML.getCode()))) {
            this.saveCSML(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.CSML.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.LXXZ.getCode()))) {
            this.saveLXXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.LXXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.XXXZ.getCode()))) {
            this.saveXXXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.XXXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.MJXZ.getCode()))) {
            this.saveMZXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.MJXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.XBXZ.getCode()))) {
            this.saveXBXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.XBXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.SXXZ.getCode()))) {
            this.saveSXXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.SXXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.LKYZ.getCode()))) {
            this.saveLKYZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.LKYZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.KDXZ.getCode()))) {
            this.saveKDXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.KDXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.NKXZ.getCode()))) {
            this.saveNKXZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.NKXZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.NKYS.getCode()))) {
            this.saveNKYS(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.NKYS.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.TX.getCode()))) {
            this.saveTX(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.TX.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.JXL.getCode()))) {
            this.saveJXL(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.JXL.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.FBL.getCode()))) {
            this.saveFBL(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.FBL.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.BZ.getCode()))) {
            this.saveBZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.BZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.BB.getCode()))) {
            this.saveBB(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.BB.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.CXWZ.getCode()))) {

            this.saveCXWZ(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.CXWZ.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.CXZT.getCode()))) {
            this.saveCXZT(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.CXZT.getCode())));
        }
        if (StringUtils.isNotBlank(valueMap.get(EMeasureKey.CXYS.getCode()))) {
            this.saveCXYS(orderCode, productCode,
                modelSmap.get(valueMap.get(EMeasureKey.CXYS.getCode())));
        }
    }

    private void saveCXYS(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.CXYS.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveCXZT(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.CXZT.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveCXWZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.CXWZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveCSML(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.CSML.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveLXXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.LXXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveXXXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.XXXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveMZXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.MJXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveXBXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.XBXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveSXXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.SXXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveLKYZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.LKYZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveKDXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.KDXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveNKXZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.NKXZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveNKYS(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.NKYS.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveTX(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.TX.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveJXL(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.JXL.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveFBL(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.FBL.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveBZ(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.BZ.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveBB(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.BB.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    private void saveCSGG(String orderCode, String productCode,
            ModelSpecs modelSpecs) {
        ProductSpecs data = new ProductSpecs();
        data.setCode(modelSpecs.getCode());
        data.setName(modelSpecs.getName());
        data.setType(modelSpecs.getType());
        data.setPic(modelSpecs.getPic());
        data.setParentCode(EMeasureKey.CSGG.getCode());
        data.setProductCode(productCode);
        data.setOrderCode(orderCode);
        productSpecsDAO.insert(data);
    }

    @Override
    public List<ProductSpecs> queryProductSpecsList(String productCode) {
        ProductSpecs condition = new ProductSpecs();
        condition.setProductCode(productCode);
        return productSpecsDAO.selectList(condition);
    }

}
